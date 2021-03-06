package com.app.recommendify4.ThreadManagers;

import java.util.concurrent.Executor;

public class ThreadLauncher implements Executor {

    @Override
    public void execute(Runnable command) {
        Thread userProfileThread = new Thread(command);
        try {
            userProfileThread.start();
            //POÑER O JOIN PARA QUE ESPERE X SEGUNDOS E NON INFINITO
            userProfileThread.join();
        } catch (InterruptedException e) {
            System.out.println("Error building profile");
            e.printStackTrace();
        }
    }
}

