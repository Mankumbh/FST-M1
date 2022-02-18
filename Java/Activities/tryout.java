package activities;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tryout {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        System.out.println(count);

        scan.close();
        }
        }
