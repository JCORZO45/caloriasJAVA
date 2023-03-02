import javax.swing.JOptionPane;
public class Calorias {
    public static void main(String[] args) {
        int[] calorias;
    int dia=0,diaMenos=0,mayor,menor;
    double suma=0;
    //String[ ] dias;
    //dias = new String[7];
    JOptionPane.showMessageDialog(null, "Calcular Calorias");
    String[ ] dias = {"lunes", "martes", "miercoles","jueves","viernes","sabado","domingo"};
    

    
    // processing
    calorias = new int[7];
    for (int i=0;i<7;i=i+1)
    {
        calorias[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite las calorias del dia "+dias[i]));
        dia=i+1;
        //JOptionPane.showMessageDialog(null, "Las calorias del dia " + dias[i] + " son: " + calorias[i]);
        System.out.println ("Las calorias del dia " + dias[i] + " son: " + calorias[i]);
    }
    mayor=calorias[0];
    for (int a = 1; a < calorias.length; a++) {
        if (calorias[a] > mayor) {
            mayor = calorias[a];
            dia=a;
        }
    }
    menor=calorias[0];
    for (int a = 1; a < calorias.length; a++) {
        if (calorias[a] < menor) {
            menor = calorias[a];
            diaMenos=a;
        }
    }
    for(int x=0;x<7;x++){
        suma=suma+calorias[x];
    }
    suma=suma/7;
    //dia con mas calorias
        JOptionPane.showMessageDialog(null,"El dia "+dias[dia]+" fue el dia con mas calorias.\nCalorias quemadas el dia "+dias[dia]+" fue : "+mayor);
    //dia con menos calorias 
        JOptionPane.showMessageDialog(null,"El dia "+dias[diaMenos]+" fue el dia con menos calorias.\nCalorias quemadas el dia "+dias[diaMenos]+" fue : "+menor);
    //promedio de calorias 
        JOptionPane.showMessageDialog(null,"El Promedio de calorias fue : "+suma);
    }
        
}
    
    
