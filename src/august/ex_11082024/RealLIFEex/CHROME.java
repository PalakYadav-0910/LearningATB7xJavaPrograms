package august.ex_11082024.RealLIFEex;

public class CHROME extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        return "";
    }


}
