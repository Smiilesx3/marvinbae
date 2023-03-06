package calculator;

public class Converter {
    public double methodeKmToMiles(double kilometers) {
        return kilometers / 1.6;
    }

    public double methodeMilesToKM(double miles) {
        return miles * 1.6;
    }

    public String methodeHhMmSsToMmSs(String[] time) {
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);


        int convertedMinutes = hours * 60 + minutes;

        //return convertedMinutes + ":" + seconds;

        String test = String.format("%02d", convertedMinutes);
        String test2 = String.format("%02d", minutes % 60);
        String test3 = String.format("%02d", seconds);

        return test + ":" + test2 + ":" + test3;


    }

    public String methodeMmSsToHhMmSs(String[] timeMi) {
        int minutes = Integer.parseInt(timeMi[0]);
        int seconds = Integer.parseInt(timeMi[1]);


        int convertedHours = minutes / 60;

        String test = String.format("%02d", convertedHours);
        String test2 = String.format("%02d", minutes % 60);
        String test3 = String.format("%02d", seconds);


        return test + ":" + test2 + ":" + test3;

    }


}
