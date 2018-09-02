import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว", "0");
//        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null
                ,"หิวไหม"
                ,"ถามไง"
                , JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null,"ก็ไปกินสิ");
        }else {
            JOptionPane.showMessageDialog(null,"แล้วแต่");
        }

    }
}
