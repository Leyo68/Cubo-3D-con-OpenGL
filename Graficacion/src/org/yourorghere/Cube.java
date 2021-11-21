package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class Cube implements GLEventListener {
    
        
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();
        
        canvas.addGLEventListener(new Cube());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }
    
    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        //drawable.setGL(new DebugGL(drawable.getGL()));
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        //Determinan el tamaño final de la ventana en la que se visualiza la imagen
        gl.glViewport(0, 0, width, height);
        //GL_PROJECTION: Matriz de proyección
        gl.glMatrixMode(GL.GL_PROJECTION);
        //Inicializa la matriz actual, con los valores de la matriz identidad 4*4
        gl.glLoadIdentity();
        //Matriz de proyección que define una vista simétrica y la multiplica por la matriz actual
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glTranslated(0, 0, -15);
        //Matriz de modelo y vista
        gl.glMatrixMode(GL.GL_MODELVIEW);
        //Inicializa la matriz actual, con los valores de la matriz identidad 4*4
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        
        
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
//        gl.glEnable(GL.GL_CULL_FACE);
//        gl.glTranslated(2, 1, 1);
//        gl.glScaled(1.5, 1.5, 1.5);
//        gl.glRotated(180, 0, 1, 0);
//        gl.glRotated(30, 1, 0, 0);
//        gl.glRotated(rotate_y, 0, 1, 0);

        
//        gl.glEnable(GL.GL_LIGHTING);//Activa la iluminación
//        
//        gl.glLightfv(GL.GL_LIGHT0,GL.GL_AMBIENT, );//Posición/dirección de la luz
//        gl.glLightfv(GL_LIGHTn,GL_SPOT_DIRECTION,val_prt);//Dirección del foco para una luz focal
//        gl.glLightf(GL_LIGHTn,GL_SPOT_CUTOFF,val);//Apertura del foco
//        gl.glEnable(GL_LIGHTn);//Activar la luz
//        gl.glMaterialf(GL.GL_FRONT_AND_BACK, 0, 0);//Material
//        //gl.glMaterialfv(GL.GL_FRONT[_AND_BACK],[GL.GL_AMBIENT|GL.GL_DIFUSSE|GL.GL_AMBIENT_AND_DIFUSSE|GL.GL_SPECULAR],val_ptr);
//        //gl.glMaterialfv(0, 0, params);
//        
        
        
        

        
        gl.glBegin(GL.GL_QUADS);//ABAJO
            gl.glColor3f(0.0f, 0.0f, 1.0f);    // Set the current drawing color to light blue
            gl.glVertex3f(-3.0f, 0.0f, -2.0f);  // Top Left
            gl.glVertex3f(0.0f, 1.0f, -4.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(3.0f, 0.0f, -2.0f);  // Bottom Right
            gl.glVertex3f(0.0f, -1.0f, 0.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_QUADS);//IZQUIERDA IZQUIERDA
            gl.glColor3f(1.0f, 0.0f, 1.0f);    // Set the current drawing color to light blue
            gl.glVertex3f(-3.0f, 3.0f, -2.0f);  // Top Left
            gl.glVertex3f(0.0f, 4.0f, -4.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(0.0f, 1.0f, -4.0f);  // Bottom Right
            gl.glVertex3f(-3.0f, 0.0f, -2.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_QUADS);//DERECHA DERECHA
            gl.glColor3f(0.0f, 1.0f, 0.0f);    // Set the current drawing color to light blue
            gl.glVertex3f(0.0f, 4.0f, -4.0f);  // Top Left
            gl.glVertex3f(3.0f, 3.0f, -2.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(3.0f, 0.0f, -2.0f);  // Bottom Right
            gl.glVertex3f(0.0f, 1.0f, -4.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);//DERECHA
            gl.glColor3f(1.0f, 1.0f, 0.0f);    // Set the current drawing color to light blue
//            gl.glColor3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(0.0f, 2.0f, 0.0f);  // Top Left
            gl.glVertex3f(3.0f, 3.0f, -2.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(3.0f, 0.0f, -2.0f);  // Bottom Right
            gl.glVertex3f(0.0f, -1.0f, 0.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_QUADS);//IZQUIERDA
            gl.glColor3f(0.0f, 1.0f, 1.0f);    // Set the current drawing color to light blue
//            gl.glColor3f(1.0f, 0.0f, 0.0f);
            gl.glVertex3f(-3.0f, 3.0f, -2.0f);  // Top Left
            gl.glVertex3f(0.0f, 2.0f, 0.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(0.0f, -1.0f, 0.0f);  // Bottom Right
            gl.glVertex3f(-3.0f, 0.0f, -2.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_QUADS);//SUPERIOR
            gl.glColor3f(1.0f, 0.0f, 0.0f);    // Set the current drawing color to light blue
            gl.glVertex3f(0.0f, 4.0f, -4.0f);  // Top Left
            gl.glVertex3f(3.0f, 3.0f, -2.0f);   // Top Right
            //gl.glColor3f(1.0f,0.5f,1.0f);      // Color a la segunda parte de cuadro
            gl.glVertex3f(0.0f, 2.0f, 0.0f);  // Bottom Right
            gl.glVertex3f(-3.0f, 3.0f, -2.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }       
}