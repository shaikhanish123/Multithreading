 class AbcExample implements Runnable {

    @Override
    public void run() {
        }

        public static void main(String[] args) {
            AbcExample example = new AbcExample();
            Thread thread = new Thread(example);
            thread.start();
        }

    }

    

