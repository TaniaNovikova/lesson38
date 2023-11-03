package ait.exception;

public class ExceptionAppl {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            int x = solution(a, b);
            System.out.println("Solution = " + x);
        } catch (ArithmeticException e) {
            System.out.println("Solution any number");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("No solution");
            return;
        } finally {
            System.out.println("Bye, bye");
        }
        System.out.println("Math is great!");
    }

    public static int solution(int a, int b) {
        if (a == 0 && b != 0) {
            throw new IllegalArgumentException();
        }
        if (a == 0 && b == 0) {
            throw new ArithmeticException();
        }
        int res = b / a;
        return res;
    }
    //Any Changes

    /*new change*/

    /*ALL in the golden afternoon
Full leisurely we glide;
For both our oars, with little skill,
By little arms are plied,
While little hands make vain pretence
Our wanderings to guide.

Ah, cruel Three! In such an hour,
Beneath such dreamy weather,
To beg a tale of breath too weak
To stir the tiniest feather!
Yet what can one poor voice avail
Against three tongues together?

“Will you walk a little faster?” said a whiting to a snail.
“There’s a porpoise close behind us, and he’s treading on my tail.
See how eagerly the lobsters and the turtles all advance!
They are waiting on the shingle—will you come and join the dance?
     Will you, won’t you, will you, won’t you, will you join the dance?
     Will you, won’t you, will you, won’t you, won’t you join the dance?
     nnnn
slfisi*commit
test1
test2
test3
test 5
test 6
test 7
test 8
test 9








*/

}