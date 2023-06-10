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
        Date date = new Date();
        bookingView.reservationTable(date, 1103, "Станислав");

        bookingView.reservationTable(date, 102, "Станислав");

        bookingView.changeReservationTable(9001, date, 102, "Станислав");
    }
}