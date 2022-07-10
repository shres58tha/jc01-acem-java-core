package com.Quiz;

import java.util.Random;
import java.util.Scanner;

public class Question
{
    Score myScore = new Score() ;
    Scanner myScanner = new Scanner(System.in) ;

    public void questions () {
        String[] questions = {
            "Which of the following declares an array of integers named number?\n\n1) int number ;\n2) int [ ] number ;\n3) int new number [ ] ;\n4) int number = int [ ] ;\n",
            "What is the output of the following code fragments?\nint [ ] fun = new int [5];\nfun[0] = 1;\nfun[1] = 2;\nfun[2] = 3;\nfun[3] = 4;\nfun[4] = 5;\nint j = 3;\nSystem.out.println(fun[ j-1]) ;\n\n1) 1\n2) 2\n3) 3\n4) 4 \n",
            "What is the output of the following code fragment?\nint [ ] odd = {1, 3, 5, 7, 9, 11 };\nSystem.out.println( odd[0] + \" \" + odd[3] ) ;\n1) 1 5\n2) 6\n3) 1 7\n4) 8\n",
            "What does the following method do?\npublic static void numbers (int [ ] num)\n{\nfor(int x = 1; x < num.length; x++)\nnum[x] = num[0];\n}\n\n1) It copies what is in cell 0 into all other cells.\n2) It changes every element to the value of x.\n3) It copies 0 into every element.\n4) It puts the array into numerical ascending order.",
            "For which of the following situations is only one array NOT appropriate?\n\n1) Working with 30 scores on the CS exam.\n2) Working with names and ages of students.\n3) Working with mileage during the weeks of vacation.\n4) Working with company monthly sales totals.\n",
            "What is the output of the following code fragment?\nint [ ] evens = {2, 4, 6, 8, 10};\nevens[0] = 44;\nevens[4] = evens[2];\nSystem.out.println(evens[0] + \" \" + evens[4]) ;\n\n1) 44 10\n2) 2 10\n3) 54\n4) 44 6\n",
            "What are the subscripts for this array? int [ ] k = { 11, 12, 13, 14, 15};\n\n1) 0, 1, 2, 3, 4\n2) 1, 2, 3, 4, 5\n3) 11, 12, 13, 14, 15\n4) 10, 11, 12, 13, 14\n",
            "What is the output of the following code fragment?\nint [ ] items = {2, 7, 3, 5, 8, 9};\nint funny = items[0];\nfor (int i = 0; i < items.length; i++)\n{\nif (items[ i ] > funny)\nfunny = items[ i ];\n}\nSystem.out.print(funny) ;\n\n1) 2\n2) 9\n3) 2 3 5 7 8 9\n4) 2 7 3 5 8 9\n",
            "What number is in matrix[2][2]?\nint [ ] [ ] matrix = { {1, 2, 3, 4},\n{5, 6, 7, 8},\n{9, 10, 11, 12},\n{13, 14, 15, 16}\n};\n\n1) 6\n2) 7\n3) 10\n4) 11\n",
            "What is the output of the following code fragment?\ndouble [ ] x = new double [ 4];\nx[0] = 8.5;\nx[1] = 6.5;\nx[2] = 9.5;\nx[3] = 12.5;\nSystem.out.println(x[1 + 2]) ;\n\n1) 6.5 9.5\n2) 12.5\n3) 15.0\n4) 9.5 12.5\n",
            "What is the output for the following code fragment?\nint [ ] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};\nfor (int j = 0; j < numbers.length; j++)\nSystem.out.print(numbers[ j ] + \" \") ;\n\n1) 1 2 3 4 5\n2) 6 7 8 9 10\n3) 2 3 4 5 6 7 8 9 10\n4) 1 2 3 4 5 6 7 8 9 10\n",
            "What is the output for the following code fragment?\nint [ ] a = new int [5];\na[0] = 5;\na[1] = 4;\na[2] = 3;\nSystem.out.print(a[0] + a[1] + a[4]) ;\n\n1) 9\n2) 5 3 1\n3) 5 3 0\n4) 8\n",
            "What is the output for the following code fragment?\nint [ ] car = new int [ 7];\ncar[0] = 2004;\ncar[1] = 2006;\nSystem.out.println(car[0] + \" \" + car[1] + \" \" car[7]) ;\n\n1) 2004 2006 0\n2) 2004 2006\n3) 4010\n4) an error will occur\n",
            "What is the output for the following code fragment?\nint [ ] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};\nfor (int i = 0; i < 4; i++)\nSystem.out.print(array[i] + \" \") ;\n\n1) 2 4 6 8 10\n2) 2 4 6 8\n3) 2 4 6\n4) 2 4 6 8 10 12 14 16 18 20\n",
            "What is the output for the following code fragment?\nint [ ] dedo = { 1, 3, 6, 9, 2, 5, 7};\nint que = dedo[0];\nfor (int k = 0; k < dedo.length; k++)\n{\nif (dedo[k] < que)\nque = dedo[k];\n}\nSystem.out.print(que) ;\n\n1) 1\n2) 2\n3) 1 3 6 9 2 5 7\n4) 7\n",
            "What is the output from the following code fragment?\nString [ ] name = { \"Joe\", \"Sue\", \"Tom\", \"Jill\", \"Patty\"};\nfor (int i = 0; i < name.length; i = i + 2)\nSystem.out.print(name[i] + \" \") ;\n\n1) Joe Sue Tom Jill Patty\n2) Patty Jill Tom Sue Joe\n3) Joe Tom Patty\n4) Sue Jill\n",
            "What does this method do?\npublic static void cutUp(String word, char [ ] letter)\n{\nif (letter.length >= word.length( ) )\nfor (int i = 0; i < word.length( ) ; i++)\nletter[i] = word.charAt(i) ;\n}\n\n1) It checks to see if the array contains the same letters as the String.\n2) It copies letters from the array to the String.\n3) If there are enough cells in the array, it copies each letter from the String\nto the array.\n4) It creates a new array that holds the letters from the String.\n",
            "What is the output of the following code fragment?\nint [ ] array = { 2, 4, 6, 8, 1, 3, 5, 7};\nint george = 0;\nfor (int i = 0; i < array.length; i++)\ngeorge += array[i];\nSystem.out.print(george) ;\n\n1) 2 4 6 8 1 3 5 7\n2) 2 4 6 8\n3) 7\n4) 36\n",
            "What is the length of this array?\ndouble[ ] stuff = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};\n\n1) 1\n2) 5\n3) 6\n4) 7\n",
            "Which code line could possibly \"call\" this method?\npublic static int SomeMethod(double[ ] array, int[ ] number)\n{ . . .\n}\n\n1) int value = SomeMethod(money, grades) ;\n2) SomeMethod(money, grades) ;\n3) double value = SomeMethod(money, grades) ;\n4) int value = SomeMethod(money) ;\n",
        };
        String[] answers = {"2","3","3","1","2","4","1","1","4","2","4","4","4","2","1","3","3","4","3","1"};
		int[] array = { 0,1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13,14,15,16,17,18,19 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {                         //randomize questions
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
        int numCorrect = 0;                                             // score tracker
        for (int i = 0; i < 20; i++) {
            System.out.println("\n\n"+ (i+1) +" : " + questions[array[i]]) ;
            String answer = myScanner.next() ;
            while (!( answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("4"))){
                System.out.println("Invalid choice! please choose 1, 2, 3 or 4 ");
                answer = myScanner.next() ;
            }
            if (answer.equals(answers[array[i]])) {
                System.out.println(answer + " is correct") ;
                numCorrect++;
            } else
            System.out.println(answer + " is incorrect") ;
        }
        myScore.score(numCorrect, 20) ;
    }
}
