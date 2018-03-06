package com.zc.singleton;

/**
 * http://blog.csdn.net/haoxingfeng/article/details/9191619
 * 线程安全  并且效率高 
 * @author zc
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
