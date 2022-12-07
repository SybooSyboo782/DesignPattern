package com.syboosyboo.designpattern.creational.singleton;

/**
 * <pre>
 * Class : EagerSingleton
 * Comment: 이른 초기화 싱글톤패턴
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-12-06       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }

}