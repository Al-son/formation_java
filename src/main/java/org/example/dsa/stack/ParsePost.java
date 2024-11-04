package org.example.dsa.stack;

public class ParsePost {
    private StackX stackX;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        stackX = new StackX(20);
        char ch;
        int j;
        int num1, num2, interAns;

        for (j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            stackX.displayStack(" " + ch + " ");
            if (ch >= '0' && ch <= '9')
                stackX.push((char) (ch-'0'));
            else {
                num2 = stackX.pop();
                num1 = stackX.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                    }
                stackX.push((char) interAns);
            }
        }
        interAns = stackX.pop();
        return  interAns;
    }
}