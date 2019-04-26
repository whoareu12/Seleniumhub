package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Addproduct {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.NAME,using="Login")
	public static WebElement Login;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[2]/button")
	public static WebElement AddCategory;
	@FindBy(how=How.ID,using="catgName")
	public static WebElement categoryname;
	@FindBy(how=How.ID,using="catgDesc")
	public static WebElement categorydescription;
	@FindBy(how=How.CSS,using="input[value='Add']")
	public static WebElement add;
	//@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
	//public static WebElement message;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[3]/button")
	public static WebElement AddSubcategoryName;
	@FindBy(how=How.ID,using="subCatgId")
	public static WebElement Category;
	@FindBy(how=How.ID,using="subCatgName")
	public static WebElement subcategoryname;
	@FindBy(how=How.ID,using="subCatgDesc")
	public static WebElement subcategorydescription;
	@FindBy(how=How.CSS,using="input[value='Add']")
	public static WebElement Add;
	//@FindBy(how=How.PARTIAL_LINK_TEXT,using="/html/body/main/div/div/div/form/b/i")
	public static WebElement statement;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button")
	public static WebElement Addproduct;
	@FindBy(how=How.ID,using="categorydropid")
	public static WebElement category;
	
	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcategory;
	@FindBy(how=How.ID,using="prodid")
	public static WebElement product;
    @FindBy(how=How.ID,using="priceid")
	public static WebElement price;
    @FindBy(how=How.ID,using="quantityid")
    public static WebElement quantity;
    @FindBy(how=How.ID,using="brandid")
    public static WebElement brand;
    @FindBy(how=How.ID,using="description")
    public static WebElement description;
    @FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input")
    public static WebElement browse;
    @FindBy(how=How.CLASS_NAME,using="/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")
    public static WebElement adding;
    @FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
    public static WebElement text;
}
