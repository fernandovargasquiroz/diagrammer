package GUI;

import java.awt.*;

import GUI.Elementos.*;

public class TestFrame{

    Frame frame;
    ToolBox box;
    WorkFrame drawZone;
    MainContainer main;
    Dimension buttonsDimension;
    DrawInterfaceElement dibujo;

    public TestFrame(){
        buttonsDimension = new Dimension(150,50);
        // CAJA DE HERRAMIENTAS
        box = new ToolBox(150,450);
        // ZONA DE DIBUJO
        drawZone = new WorkFrame(750,550);
        // QUE DIBUJARE
        // Colores
        DrawElement el = new DrawInterfaceElement();
        DrawElement cl = new DrawClassElement();
        DrawElement per = new DrawPersonaElement();
        DrawElement per2 = new DrawPersonaElement();
        DrawElement per3 = new DrawPersonaElement();
        // LAPIZ
        ToolButton redondos = new ToolButton(drawZone, el,"Interface", buttonsDimension);
        ToolButton cuadrados = new ToolButton(drawZone, cl,"Clase", buttonsDimension);
        ToolButton personas = new ToolButton(drawZone, per,"User", buttonsDimension);
        ToolButton linea = new ToolButton(drawZone, per2,"Continua", buttonsDimension);
        ToolButton punteada = new ToolButton(drawZone, per3,"Punteada", buttonsDimension);
        ToolButton dhf = new ToolButton(drawZone, per3,"dhf", buttonsDimension);


        //agrego lapiz a mi toolbox
        box.add(redondos);
        box.add(cuadrados);
        box.add(personas);
        box.add(linea);
        box.add(punteada);
        box.add(dhf);

        main = new MainContainer(box, drawZone, 1000,600);
        frame = new Frame(main, "UML",700,601);
        frame.repaint();
    }
    public static void main(String [] args){
        new TestFrame();
    }
}
