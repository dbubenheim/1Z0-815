package enthuware.ocpjp.i.v11_2;

public class Q_1057 {

    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: {

                System.out.println(c);

                for (int i = 0; i < 100; i++) {
                    if (i > 10) break JILL;
                    else break JACK;
                }
            }
            // if (c > 3) break JILL; else c++; // undefined label JILL

            WHATEVER: {

            }

            SOME_LABEL: while(true) { break SOME_LABEL; }

            ANOTHER_ONE: {
                var s = 100;
            }

            SWITCH_LABEL: switch (100) {
                case 100:
                    System.out.println("100!");
                    return;
                default: break SWITCH_LABEL;
                case 200:
                    System.out.println("200!");
                    return;
            }

            BLA: if (c == 0) {

                break JACK;
                // break BLA;
                //return;
            }
        }
    }
}
