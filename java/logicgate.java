/*
    Logic gate simulation in JAVA

    other class

    Author: Harshit Joshi

*/

public class logicgate {
    public int andgate(int a, int b){
        if ((a == 1 || a == 0) && ((b == 1 || b == 0))){
            if (a == 1 && b == 1)
                return 1;
            else
                return 0;
        }
        else
            return -1;
    }
    public int orgate(int a, int b){
        if ((a == 1 || a == 0) && ((b == 1 || b == 0))){
            if (a == 1 || b == 1)
                return 1;
            else
                return 0;
        }
        else
            return -1;
    }
    public int notgate(int a){
        if (a == 1 || a == 0){
            if (a == 1)
                return 0;
            else
                return 1;
        }
        else
            return -1;
    }
    public int nandgate(int a, int b){
        if ((a == 1 || a == 0) && ((b == 1 || b == 0))){
            if (a == 1 && b == 1)
                return 0;
            else
                return 1;
        }
        else
            return -1;
    }
    public int norgate(int a, int b){
        if ((a == 1 || a == 0) && ((b == 1 || b == 0))){
            if (a == 1 || b == 1)
                return 0;
            else
                return 1;
        }
        else
            return -1;
    }
}
