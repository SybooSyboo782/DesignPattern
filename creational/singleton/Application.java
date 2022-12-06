package creational.singleton;

/**
 * <pre>
 * Class : creational.singleton.Application
 * Comment: 싱글턴 패턴 연습
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-12-06       부시연           최초 생성
 * </pre>
 * @version 1(클래스 버전)
 * @author 부시연(최초 작성자)
 * @see (참고할 class 또는 외부 url)
 */
public class Application {

    public static void main(String[] args) {

        /* singleton pattern*/
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1의 hashCode : " + eager1.hashCode());
        System.out.println("eager2의 hashCode : " + eager2.hashCode());

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1의 hashCode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashCode : " + lazy2.hashCode());

    }

}
