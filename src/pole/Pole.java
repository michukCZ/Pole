/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole;

import java.util.Random;

/**
 * @author 2reznmi
 */
public class Pole {
    /**
     * @param pole     Pole
     * @param nejmensi Pozice nejmenšího čísla
     * @param nejvetsi Pozice největšího čísla
     *                 Vypíše pole a zvýrazní nejmenší a největší číslo
     */
    public static void vypis(int[] pole, int nejmensi, int nejvetsi) {
        for (int i = 0; i < pole.length; i++) {
            if (i == nejmensi) {
                System.out.print((char) 27 + "[31m" + "↓" + pole[i] + "↓" + (char) 27 + "[39m");
                if (i != pole.length - 1) {
                    System.out.print(", ");
                }
            } else if (i == nejvetsi) {
                System.out.print((char) 27 + "[34m" + "↑" + pole[i] + "↑" + (char) 27 + "[39m");
                if (i != pole.length - 1) {
                    System.out.print(", ");
                }
            } else {
                System.out.print(pole[i]);
                if (i != pole.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    /**
     * @param pole Pole
     *             Vypise pole.
     */
    public static void vypis(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i]);
            if (i != pole.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * @param pole Pole
     *             Seradi pole od nejmensi po nejvetsi.
     */
    public static void seraditNejmensi(int[] pole) {
        boolean changed;
        do {
            int i = 0;
            changed = false;
            while (i < pole.length - 1) {
                if (pole[i] > pole[i + 1]) {
                    int first = pole[i];
                    int second = pole[i + 1];
                    pole[i] = second;
                    pole[i + 1] = first;
                    changed = true;
                }
                i++;
            }
        } while (changed);
    }

    /**
     * @param pole Pole
     *             Seradi pole od nejvetsiho po nejmensi.
     */
    public static void seraditNejvetsi(int[] pole) {
        boolean changed;
        int ia = 0;
        do {
            ia = 0;
            changed = false;
            while (ia < pole.length - 1) {
                if (pole[ia] < pole[ia + 1]) {
                    int first = pole[ia];
                    int second = pole[ia + 1];
                    pole[ia] = second;
                    pole[ia + 1] = first;
                    changed = true;
                }
                ia++;
            }
        } while (changed);
    }

    /**
     * @param pole Pole
     * @return Součet pole
     * Vypíše součet pole
     */
    public static int soucet(int[] pole) {
        int soucet = 0;
        for (int number : pole) {
            soucet += number;
        }
        return soucet;
    }

    /**
     * @param pole Pole
     * @param max  Maximální hodnota
     *             Náhodně zaplní pole s maximem MAX
     */
    public static void zaplnit(int[] pole, int max) {
        Random random = new Random();
        for (int i = 0; i < pole.length; i++) {
            pole[i] = random.nextInt(max);
        }
    }

    /**
     * @param pole Pole
     * @return Průměr
     * Vrací průměr hodnot z pole
     */
    public static double prumer(int[] pole) {
        int soucet = soucet(pole);
        return (double) soucet / pole.length;
    }

    /**
     * @param pole Pole
     * @return Nejmenší číslo
     */
    public static int nejmensi(int[] pole) {
        int nejmensi = Integer.MAX_VALUE;
        for (int i = 0; i < pole.length; i++) {
            int cislo = pole[i];
            if (cislo < nejmensi) {
                nejmensi = cislo;
            }
        }
        return nejmensi;
    }

    /**
     * @param pole Pole
     * @return Největší číslo
     */
    public static int nejvetsi(int[] pole) {
        int nejvetsi = Integer.MIN_VALUE;
        for (int i = 0; i < pole.length; i++) {
            int cislo = pole[i];
            if (cislo > nejvetsi) {
                nejvetsi = cislo;
            }
        }
        return nejvetsi;
    }

    /**
     * @param pole Pole
     * @return Index nejmenšího čísla
     */
    public static int nejmensiIndex(int[] pole) {
        int nejmensi = Integer.MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < pole.length; i++) {
            int cislo = pole[i];
            if (cislo < nejmensi) {
                nejmensi = cislo;
                indexMin = i;
            }
        }
        return indexMin;
    }

    /**
     * @param pole Pole
     * @return Index největšího čísla
     */
    public static int nejvetsiIndex(int[] pole) {
        int nejmensi = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < pole.length; i++) {
            int cislo = pole[i];
            if (cislo > nejmensi) {
                nejmensi = cislo;
                indexMax = i;
            }
        }
        return indexMax;
    }

    /**
     *
     * @param pole Pole
     *             Vypíše lichá čísla
     */
    public static void vypisLicha(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 1) {
                System.out.print(pole[i]);
                if (i != pole.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    /**
     *
     * @param pole Pole
     *             Vypíše sudá čísla
     */
    public static void vypisSuda(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0) {
                System.out.print(pole[i]);
                if (i != pole.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nazvyDnu = {"pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota", "neděle"};
        int[] a = new int[50];
        zaplnit(a, 100);
        int[] nejmensiPole = a.clone();
        seraditNejmensi(nejmensiPole);
        int[] nejvetsiPole = a.clone();
        seraditNejvetsi(nejvetsiPole);
        vypis(a, nejmensiIndex(a), nejvetsiIndex(a));
        vypis(nejmensiPole);
        vypis(nejvetsiPole);
        vypisLicha(a);
        vypisSuda(a);
        System.out.println("Součet = " + soucet(a));
        System.out.println("Průměr = " + prumer(a));
        System.out.println("Nejmenší = " + nejmensi(a) + " na místě: " + nejmensiIndex(a));
        System.out.println("Největší = " + nejvetsi(a) + " na místě: " + nejvetsiIndex(a));
    }
}