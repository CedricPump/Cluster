

public class Main {

    public static void main(String[] args) {
        int punkte = 150;
        Point2D[] clusterZentren = null;
        Point2D[] datenpunkte = new Point2D[punkte];
        int zentren = 3;

        for (int i = 0; i < zentren; i++){
            Point2D zentrum = new Point2D(Math.random()*10-5, Math.random()*10-5);
            for(int j = 0 ; j < punkte / zentren; j++){
                datenpunkte[j+i*punkte/zentren] = new Point2D(zentrum.getX()+Math.random()*6-3,zentrum.getY()+Math.random()*6-3);
            }
        }
        printP2DArray(datenpunkte);

        ////////////////////////////////////////////////////////////////
        //                      Studi:


        ////////////////////////////////////////////////////////////////

    }

    static private double dist(Point2D p1,Point2D p2) {
        return  p1.distance(p2);
    }

    static private void printP2DArray(Point2D[] arr){
        String str = "[";
        for (Point2D p : arr) {
            str += p.toString() + ", ";
        }
        if(arr.length > 0) str = str.substring(0,str.length()-2);
        str += "]";
        System.out.println(str);
    }
}
