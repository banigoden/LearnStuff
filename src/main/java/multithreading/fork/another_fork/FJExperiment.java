package multithreading.fork.another_fork;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if(args.length != 2){
            System.out.println("Parallelism");
        }

        pLevel = 2;
        threshold = 2000;

        long beginT, entT;

        ForkJoinPool forkJoinPool = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0 , nums.length, threshold);

        beginT = System.nanoTime();
        forkJoinPool.invoke(task);
        entT = System.nanoTime();
        System.out.println("Level of parallelism " + pLevel);
        System.out.println("Sequential " + threshold);
        System.out.println("Time " + (entT - beginT) + " ns");
    }
}
