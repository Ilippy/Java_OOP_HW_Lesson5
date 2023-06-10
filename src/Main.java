import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 102, "Станислав");
    }
}