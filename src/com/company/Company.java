package com.company;

public class Company {
    public void getSalaryInfo(String[] names, String[] data, int dateFrom, int dateTo) throws IllegalDateParametersExeption {
        int counter = 0;
        int counter1 = -1;
        int counter2 = -2;
        if (dateFrom > dateTo) {
            throw new IllegalDateParametersExeption("Wrong parametrs");
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
                counter++;
                if (i == 0) {
                } else if (counter % 4 == 0) {
                    System.out.println(" ");
                }
            }
            System.out.println("\nОтчёт за период от " + dateFrom + " дней до " + dateTo + " дней: ");
            for (int i = 0; i < data.length / 4; i++) {
                counter = i * 4;
                int a = Integer.parseInt(data[counter]);
                if (a >= dateFrom && a <= dateTo) {
                    int dateResult = dateTo - a;
                    counter2 += 4;
                    int b = Integer.parseInt(data[counter2]);
                    counter1 += 4;
                    int c = Integer.parseInt(data[counter1]);
                    int result = (c * dateResult) * b;
                    System.out.println(names[i] + " " + result);
                }
            }
        }
    }
}
