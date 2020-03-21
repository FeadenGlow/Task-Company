package com.company;

public class Main {

    public static void main(String[] args) throws IllegalDateParametersExeption {
        String[] names = {"Tom","BOb"};
        String[] globaldata = {"25","Tom","20","20","28","BOb","31","13"};

        int dateFrom = 20;
        int dateTo = 30;
        Company comp = new Company();
        comp.getSalaryInfo(names, globaldata, dateFrom, dateTo);
    }
}

