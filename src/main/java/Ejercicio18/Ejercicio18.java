package Ejercicio18;

import com.github.javafaker.Faker;

import java.util.Random;

public class Ejercicio18 {
    private static Faker faker = new Faker();
    private static Random random = new Random();

    private static final int NUMERO_VIDEO_JUEGOS = 5;
    private static final int NUMERO_SERIES = 5;

    public static void main(String[] args) {
        VideoJuego videoJuegos[] = crearVideoJuegos(NUMERO_VIDEO_JUEGOS);
        Serie series[] = crearSeries(NUMERO_SERIES);
        /**
         * Numeros aleatorios para simular la cantidad de video juegos y series que seran entregados
         */
        int randomSeries = faker.random().nextInt(1, series.length);
        int randomVideoGames = faker.random().nextInt(1, videoJuegos.length);
        int [] randomNumbersForSeries =  randomNumbers(randomSeries, 0, series.length );
        int [] randomNumbersForVideoGames =  randomNumbers(randomVideoGames, 0, videoJuegos.length );


        /**
         * Entregar algunos videos juegos y series 
         */
        // Entrego series
        for (int i = 0; i < randomSeries; i++) {
            series[randomNumbersForSeries[i]].entregar();
        }
        // Entrego video juegos
        for(int i = 0; i < randomVideoGames; i++) {
            videoJuegos[randomNumbersForVideoGames[i]].entregar();
        }

        /**
         *	Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos
         */
        int numeroSeriesEntregadas = numeroSeriesEntregadas(series);
        int numeroVideoJuegosEntregados = numeroVideoJuegosEntregados(videoJuegos);

        System.out.printf("El número de series entregadas es: %d %n" , numeroSeriesEntregadas);
        System.out.printf("El número de video juegos entregados es: %d %n" , numeroVideoJuegosEntregados);

        VideoJuego videoJuegoConMasHoras = getVideoJuegoConMasHoras(videoJuegos);
        Serie serieConMasTemporadas = getViSerieConMasTemporadas(series);

        System.out.println("--- VIDEO JUEGO CON MAS HORAS ---");
        System.out.println(videoJuegoConMasHoras.toString());

        System.out.println("--- SERIE CON MAS HORAS --");
        System.out.println(serieConMasTemporadas.toString());





    }

    public static VideoJuego getVideoJuegoConMasHoras(VideoJuego[] videoJuegos) {
        VideoJuego videoJuegoConMasHoras = videoJuegos[0];
        for (int j = 1; j < videoJuegos.length; j++) {
            if(videoJuegoConMasHoras.compareTo(videoJuegos[j])) {
                videoJuegoConMasHoras = videoJuegos[j];
            }
        }
        return videoJuegoConMasHoras;
    }

    public static Serie getViSerieConMasTemporadas(Serie[] series) {
        Serie serieConMasTemporadas = series[0];
        for (int j = 1; j < series.length; j++) {
            if(serieConMasTemporadas.compareTo(series[j])) {
                serieConMasTemporadas = series[j];
            }
        }
        return serieConMasTemporadas;
    }


    public static int numeroSeriesEntregadas(Serie[] series) {
        int nSeriesEntregadas = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i].isEntregado()) {
                nSeriesEntregadas++;
            }
        }

        return nSeriesEntregadas;
    }


    public static int numeroVideoJuegosEntregados(VideoJuego[] videoJuegos) {
        int nVideoJuegosEntregados = 0;
        for (VideoJuego videoJuego: videoJuegos) {
            if(videoJuego.isEntregado()) {
                nVideoJuegosEntregados++;
            }
        }
        return nVideoJuegosEntregados;
    }

    public static int[] randomNumbers(int cNumbers, int min, int max) {
        int[] randoms = new int[cNumbers];
        for (int i = 0; i < cNumbers; i++) {
            randoms[i] = faker.number().numberBetween(min, max);
        }
        return randoms;
    }

    public static void mostrarVideoJuegos(VideoJuego [] videoJuegos ) {
        for (int i = 0; i < videoJuegos.length; i++) {
            System.out.println(videoJuegos[i].toString());
        }
    }



    public static VideoJuego[] crearVideoJuegos(int nVideoJuegos) {
        VideoJuego videoJuegos[] = new VideoJuego[nVideoJuegos];
        VideoJuego videoJuego;
        for (int i = 0; i < nVideoJuegos; i++) {
            videoJuego = crearVideoJuego();
            videoJuegos[i] = videoJuego;
        }
        return videoJuegos;
    }

    public static VideoJuego crearVideoJuego(){
        VideoJuego videoJuego;
        int nConstructor = random.nextInt(3) + 1;
        switch (nConstructor) {
            case 1:
                videoJuego = new VideoJuego();
                break;
            case 2:
                videoJuego = new VideoJuego(faker.team().name(), faker.number().numberBetween(1,24));
                break;
            case 3:
                videoJuego = new VideoJuego(faker.team().name(), faker.number().numberBetween(1,24), faker.book().genre(), faker.company().name());
                break;
            default:
                videoJuego = new VideoJuego();
        }
        return videoJuego;
    }

    public static Serie crearSerie(){
        Serie serie;
        int nConstructor = random.nextInt(3) + 1;
        switch (nConstructor) {
            case 1:
                serie = new Serie();
                break;
            case 2:
                serie = new Serie(faker.team().name(), faker.artist().name());
                break;
            case 3:
                serie = new Serie(faker.team().name(), faker.number().numberBetween(1,24), faker.book().genre(), faker.company().name());
                break;
            default:
                serie = new Serie();
        }
        return serie;
    }

    public static Serie[] crearSeries(int nSeries) {
        Serie series[] = new Serie[nSeries];
        Serie serie;
        for (int i = 0; i < nSeries; i++) {
            serie = crearSerie();
            series[i] = serie;
        }
        return series;
    }
}
