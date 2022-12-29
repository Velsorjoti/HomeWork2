public class Main
{
    public static void main(String[] args) {
        System.out.println(" Домашняя Работа 2 ");
        int segmentBeginFist = 110;
        int segmentEndFist = 302;
        int segmentBeginSecond = 200;
        int segmentEndSecond = 415;
        if (segmentBeginFist <= segmentBeginSecond && segmentEndFist > segmentBeginSecond && segmentEndFist <= segmentEndSecond) {
            System.out.println(" Границы отрезка пересечения " + segmentBeginSecond + segmentEndFist);
        }
        else if (segmentBeginFist >= segmentBeginSecond && segmentEndFist <= segmentEndSecond) {
            System.out.println(" Границы отрезка пересечения " + segmentBeginFist + segmentEndFist);
        }
        else if (segmentBeginFist <= segmentBeginSecond && segmentEndFist > segmentEndSecond) {
            System.out.println(" Границы отрезка  пересечения " + segmentBeginSecond + segmentEndSecond);
        }
        else if (segmentBeginFist > segmentBeginSecond && segmentEndFist > segmentEndSecond) {
            System.out.println(" Границы отрезка пересечения " + segmentBeginFist + segmentEndSecond);
        }
        else if (segmentBeginFist == segmentEndSecond) {
            System.out.println(" Точка пересечения двух отрезков " + segmentBeginFist);
        }
        else if (segmentEndFist == segmentBeginSecond) {
            System.out.println(" Точка пересечения двух отрезков " + segmentEndFist);
        }
        else if (segmentBeginFist > segmentEndSecond || segmentEndFist < segmentBeginSecond) {
            System.out.println(" Прямые не имеют точек пересечения. ");
        }
    }

}