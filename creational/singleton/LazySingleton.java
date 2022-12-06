package creational.singleton;

/**
 * <pre>
 * Class : LazySingleton
 * Comment: lazysingleton 패턴
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
public class LazySingleton {

    private static LazySingleton Lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        if(Lazy == null) {
            Lazy = new LazySingleton();
        }

        return Lazy;

    }

}
