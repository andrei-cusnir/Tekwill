package wildcards;

import wildcards.test.WildcardExamples;

import static wildcards.test.WildcardExamples.*;

public class Main {

    public static void main(String[] args) {
        bar();
        foo();

        WildcardExamples wildcardExamples = new WildcardExamples();
        WildcardExamples wildcardExamples1 = new WildcardExamples();
        System.out.println(wildcardExamples.count1);
        System.out.println(new WildcardExamples().count1);
        System.out.println(new WildcardExamples().count1);
        System.out.println(new WildcardExamples().count1);
        System.out.println(new WildcardExamples().count1);
        System.out.println(new WildcardExamples().count1);
        System.out.println(wildcardExamples1.count1);
        System.out.println(WildcardExamples.count);

        wildcardExamples.count = 100;


        System.out.println(wildcardExamples.count);
        System.out.println(wildcardExamples1.count);

    }
}
