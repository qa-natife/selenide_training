package com.vlad.selenideintro;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class ShouldMusicDownload {
    @Test

    void  downloadMusic() {

        open("https://z1.fm/");

        $(byId("topkeywords")).setValue("Девочка, танцуй").pressEnter();

        $(byAttribute("data-sid", "26378698"));
        executeJavaScript("document.querySelector('.download').setAttribute('visibility', 'visible')");
        $(byClassName("download")).shouldBe(Condition.attribute("visibility")).click();





    }


}
