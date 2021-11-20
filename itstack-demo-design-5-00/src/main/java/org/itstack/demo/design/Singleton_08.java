package org.itstack.demo.design;

/**
 * @author Guofeng3
 * @date 2021年11月20日 13:26
 */
public class Singleton_08 {
    private Singleton_08() {
    }

    public static enum SingletonEnum {
        SINGLETON;
        private Singleton_08 instance = null;

        private SingletonEnum() {
            instance = new Singleton_08();
        }

        public Singleton_08 getInstance() {
            return instance;
        }
    }
}
