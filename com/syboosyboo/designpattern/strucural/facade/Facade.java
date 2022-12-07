package com.syboosyboo.designpattern.strucural.facade;

/**
 * <pre>
 * Class : Facade
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-12-07       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
public class Facade {

    private String foodName = "";
    private String desertName = "";

    public Facade(String foodName, String desertName) {
        this.foodName = foodName;
        this.desertName = desertName;
    }

    public void eat_Meal() {
        MealPrep mealPrep = new MealPrep();
        Food food = new Food(foodName);
        Desert desert = new Desert(desertName);

        food.PickOrder();
        desert.PickOrder();
        mealPrep.PutCutlery();
        food.EatFood();
        desert.EatDesert();

    }

}
