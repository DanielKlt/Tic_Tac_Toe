package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Gewinnroutine {
    Timer time;

    public Gewinnroutine() {
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Gui.gewinner == 0) {

                    // Reihe 1 f�r X - Horizontal
                    if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1) {
                        Gui.gewinner = 1;
                    }
                    // Reihe 2 f�r X - Horizontal
                    else if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Reihe 3 f�r X - Horizontal
                    else if (Gui.state[6] == 1 && Gui.state[7] == 1 && Gui.state[8] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Reihe 1 f�r X - Vertikal
                    else if (Gui.state[0] == 1 && Gui.state[3] == 1 && Gui.state[6] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Reihe 2 f�r X - Vertikal
                    else if (Gui.state[1] == 1 && Gui.state[4] == 1 && Gui.state[7] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Reihe 3 f�r X - Vertikal
                    else if (Gui.state[2] == 1 && Gui.state[5] == 1 && Gui.state[8] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Cross links oben - rechts unten f�r X
                    else if (Gui.state[0] == 1 && Gui.state[4] == 1 && Gui.state[8] == 1) {
                        Gui.gewinner = 1;
                    }

                    // Cross rechts oben - links unten f�r X
                    else if (Gui.state[2] == 1 && Gui.state[4] == 1 && Gui.state[6] == 1) {
                        Gui.gewinner = 1;
                    }

                    ////////////////////////////////////////////////////////////////////////

                    // Reihe 1 f�r O - Horizontal
                    if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2) {
                        Gui.gewinner = 2;
                        System.out.println("Hallo");
                    }
                    // Reihe 2 f�r O - Horizontal
                    else if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Reihe 3 f�r O - Horizontal
                    else if (Gui.state[6] == 2 && Gui.state[7] == 2 && Gui.state[8] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Reihe 1 f�r O - Vertikal
                    else if (Gui.state[0] == 2 && Gui.state[3] == 2 && Gui.state[6] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Reihe 2 f�r O - Vertikal
                    else if (Gui.state[1] == 2 && Gui.state[4] == 2 && Gui.state[7] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Reihe 3 f�r O - Vertikal
                    else if (Gui.state[2] == 2 && Gui.state[5] == 2 && Gui.state[8] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Cross links oben - rechts unten f�r O
                    else if (Gui.state[0] == 1 && Gui.state[4] == 2 && Gui.state[8] == 2) {
                        Gui.gewinner = 2;
                    }

                    // Cross rechts oben - links unten f�r O
                    else if (Gui.state[2] == 1 && Gui.state[4] == 2 && Gui.state[6] == 2) {
                        Gui.gewinner = 2;
                    }

                }

            }
        }, 0, 150);
    }

}
