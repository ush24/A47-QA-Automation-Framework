import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HOMEWORK19 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {
        String deletedPlaylistMsg = "Deleted playlist";
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistBtn();
        Assert.assertTrue(getDeletedPlaylistMSg().contains(deletedPlaylistMsg));
    }
    public void openPlaylist() {
        WebElement emptyPlaylist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        emptyPlaylist.click();
    }
    public void clickDeletePlaylistBtn() {
        WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletePlaylist.click();
    }
    public String getDeletedPlaylistMSg() {
        WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        return notificationMsg.getText();
    }
}


