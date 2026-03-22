package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartBadge = By.id("cart-count");
    private By checkoutButton = By.id("checkout-btn");
    private By removeButtons = By.className("remove-item");
    private By emptyCartMessage = By.id("empty-cart-msg");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getCartItemCount() {
        return Integer.parseInt(driver.findElement(cartBadge).getText());
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void removeFirstItem() {
        driver.findElements(removeButtons).get(0).click();
    }
    
    public boolean isEmptyCartMessageDisplayed() {
        return driver.findElement(emptyCartMessage).isDisplayed();
    }
}
