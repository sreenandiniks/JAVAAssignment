import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner Sobj=new Scanner(System.in);
        //String str = "JAVA";
        Runner r = new Runner();
        System.out.println("Press 1 - Remove duplicate Character in the string");
        System.out.println("Press 2  - find the largest string in the given list");
        System.out.println("Press 3 - Print the occurrence of character in a string");
        try
        {

            int ReadOption=Sobj.nextInt();
            String OString;

            switch (ReadOption)
            {
                case 1:
                    System.out.println("Enter the string to remove duplicate characters");
                    //BufferedReader ReadInput = new BufferedReader(new InputStreamReader(System.in));
                    Scanner ReadInput= new Scanner(System.in);
                    try
                    {
                       // OString = ReadInput.readLine();
                       OString= ReadInput.nextLine();
                        if (OString.isBlank()) {
                            System.out.println("The given string is empty");
                        }
                        else
                        {

                            LinkedHashSet<Character> set = new LinkedHashSet<>();//case sensitive
                            for(int i = 0;i<OString.length();i++)
                                set.add(OString.charAt(i));
                            for(Character ch : set)

                                System.out.println("The String after removing duplicate character is "+ ch);

                        }


                        }
                    catch (Exception e)
                    {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.println("Enter the collection of string");

                    Scanner ReadCollectionofString = new Scanner(System.in);
                    String stringcollection = ReadCollectionofString.nextLine(), LargestString1=null;
                    try {
                        String LargestString2[] = stringcollection.split(" ");
                        LargestString1=LargestString2[0];
                        int i =0,j = 0;
                        for( i = 0; i < LargestString2.length; i = j)
                        {
                            for( j =i+1; j < LargestString2.length; j++)
                            {
                                if(LargestString1.length() < LargestString2[j].length())
                                {
                                    LargestString1 = LargestString2[j];
                                    break;
                                }
                            }
                        }
                        System.out.println("the longest string is: " + LargestString1 + " and it's length is: " + LargestString1.length());

                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid input");
                    }



                    break;
                case 3:
                    System.out.println("Enter the string to find the character occurrence");
                    try {
                        Scanner userinput = new Scanner(System.in);
                        String UICollection = userinput.nextLine();
                        if (UICollection.isBlank()) {
                            System.out.println("The given string is empty");
                        }
                        else
                        {
                            Map<Character, Integer> map = new HashMap<>();

                            for (int i = 0; i < UICollection.length(); i++)
                            {
                                if (map.containsKey(UICollection.charAt(i)))
                                {
                                    map.put(UICollection.charAt(i), map.get(UICollection.charAt(i)) + 1);
                                }
                                else
                                {
                                    map.put(UICollection.charAt(i), 1);
                                }
                            }
                            System.out.println(map);
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid input");
                    }
                    break;
            }

        }
        catch (Exception e)
        {
            System.out.println("Invalid input to choose the option. Enter 1 2 or 3 number ");

        }
    }
}