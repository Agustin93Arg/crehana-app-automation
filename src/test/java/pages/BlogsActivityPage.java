package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BlogsActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]"
    )
    private AndroidElement crehanaSeeMoreBlogs;
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton"
    )
    private AndroidElement blogSectionBackButton;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionFeedbackBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionGestionDeTalentoBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionClimaLaboralBox;


    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionLiderazgoDeEquiposBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionTransformacionCulturalBox;
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView"
    )
    private AndroidElement blogSectionTransformacionDigitalBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView"
    )
    private AndroidElement blogSectionReclutamientoBox;
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionNegociosBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionUpskillingReskillingBox;
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionProductReleasesBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionHistoriasDeClientesBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionTrabajoRemotoBox;

    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionEstiloDeVidaBox;
    @AndroidFindBy(
            xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup"
    )
    private AndroidElement blogSectionExpertosHrBox;

   //Implement constructor

    public BlogsActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    //create methods to send actions
    public void crehanaSeeMoreBlogs() {
        this.crehanaSeeMoreBlogs.click();
    }

    public void blogSectionBackButton() {
        this.blogSectionBackButton.click();
    }

    public void blogSectionGestionDeTalentoBox() {
        this.blogSectionGestionDeTalentoBox.click();
    }

    public void blogSectionFeedbackBox() {
        this.blogSectionFeedbackBox.click();
    }
    public void blogSectionClimaLaboralBox() {
        this.blogSectionClimaLaboralBox.click();
    }

    public void blogSectionLiderazgoDeEquipoBox() {
        this.blogSectionLiderazgoDeEquiposBox.click();
    }
    public void blogSectionTransformacionCulturalBox() {
        this.blogSectionTransformacionCulturalBox.click();
    }
    public void blogSectionTransformacionDigitalBox() {
        this.blogSectionTransformacionDigitalBox.click();
    }
    public void blogSectionReclutamientoBox() {
        this.blogSectionReclutamientoBox.click();
    }
    public void blogSectionNegociosBox() {
        this.blogSectionNegociosBox.click();
    }

    public void blogSectionUpskillingReskillingBox() {
        this.blogSectionUpskillingReskillingBox.click();
    }
    public void blogSectionProductReleasesBox() {
        this.blogSectionProductReleasesBox.click();
    }
    public void blogSectionHistoriasDeClientesBox() {
        this.blogSectionHistoriasDeClientesBox.click();
    }
    public void blogSectionTrabajoRemotoBox() {
        this.blogSectionTrabajoRemotoBox.click();
    }
    public void blogSectionEstiloDeVidaBox() {
        this.blogSectionEstiloDeVidaBox.click();
    }

    public void blogSectionExpertosHrBox() {
        this.blogSectionExpertosHrBox.click();
    }



}