package chapter25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		
		//スレッドプールを作成
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		//マルチスプレッドで実行
		es.execute(() -> System.out.println("thread-1")) ;
		es.execute(() -> System.out.println("thread-2")) ;
		es.execute(() -> System.out.println("thread-3")) ;
		
		//スプレッドプールを終了する
		es.shutdown();
		
	}

}
