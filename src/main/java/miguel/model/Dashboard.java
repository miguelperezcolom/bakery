package miguel.model;

import io.mateu.mdd.core.CSS;
import io.mateu.mdd.core.annotations.FullWidth;
import io.mateu.mdd.core.annotations.KPI;
import io.mateu.mdd.core.annotations.KPIInline;
import io.mateu.mdd.core.annotations.SameLine;
import io.mateu.mdd.vaadinport.vaadin.components.charts.BarChart;
import io.mateu.mdd.vaadinport.vaadin.components.charts.LineChart;
import io.mateu.mdd.vaadinport.vaadin.components.charts.PieChart;
import io.mateu.mdd.vaadinport.vaadin.components.charts.RandomDataProvider;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Dashboard {

    @KPIInline(style = CSS.SUPERKPI)
    private long ordersToday = 200;

    @KPIInline(style = CSS.SUPERKPI)
    @SameLine
    private long orderThisYear = 4000;


    private BarChart lastYearOrders = new BarChart(new RandomDataProvider(1, 12));

    @SameLine
    private PieChart bestSellers = new PieChart(new RandomDataProvider(1, 6));


    @FullWidth
    private LineChart lastYearsSales = new LineChart(new RandomDataProvider(3, 12));



}
