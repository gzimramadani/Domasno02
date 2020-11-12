package fikt.edu.mk;

import java.util.Arrays;

public class covek {
    public String getName() {
        return name;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return "Student : "+ name +" " +prezime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String name = "Gzim";
    public String prezime = "Ramadani";

    public static class student{


        public int getN() {
            return n;
        }

        public String[] getPredmeti() {
            return predmeti;
        }

        public String[] getDatumi() {
            return datumi;
        }

        public void setN(int n) {
            this.n = n;
        }

        public void setPredmeti(String[] predmeti) {
            this.predmeti = predmeti;
        }

        public void setDatumi(String[] datumi) {
            this.datumi = datumi;
        }

        public int n = 0;
        String[] predmeti = {"OOP", "ASP", "SF", "ASO", "PKM"};
        String[] datumi = {"23.11.2020", "24.11.2020", "25.11.2020", "26.11.2020", "27.11.2020"};

        @Override
        public String toString() {
            return "Predmet " + predmeti[0 + n] + " Datum " + datumi[0 + n] + " Vnesi Ocenka : ";
        }




        public student() {

        }

        public static class ocenka{

            @Override
            public String toString() {
                return "Prosekot e: "+ getProsek();
            }

            public void setArray(int[] array) {
                Array = array;
            }

            public int[] getArray() {
                return Array;
            }

            int[] Array = new int[5];

            public float getProsek() {
                prosek = ((float)Array[0]+(float)Array[1]+(float)Array[2]+(float)Array[3]+(float)Array[4])/5;
                return prosek;
            }

            float prosek;
        }
    }
}
