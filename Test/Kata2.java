import javax.swing.*;

public class Kata2 {

    public static void main(String[] args) {
        String[] Cars= {"Maserrati", "Benz G-Wagon", "Lamborghini", "Ferrari"};
        JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setSize(420, 420);

        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Account\\TesMG_3120.JPG");
        String favCar = (String) JOptionPane.showInputDialog(frame, "PICK YOUR OWN FAVORITE CAR",
        "*VROOM VROOM VROOOOOOMM*", JOptionPane.QUESTION_MESSAGE, icon, Cars, Cars[0]  );
        JOptionPane.showMessageDialog(
               frame,
               "Player1 has selected: \n" +favCar,
                "*VROOM VROOM* racing game",
                JOptionPane.INFORMATION_MESSAGE

        );

        System.out.println(favCar);

    }





}



