package processeur;

import java.text.DecimalFormat;

/**
 * Application "CPU".
 *
 * Cette classe représente un CPU d'un ordinateur.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18 octobre 2023
 * @version 0.1
 */
public class CPU {

    /**
     * Cette constante (-1.0) représente une performance MIPS (Millions Instructions
     * Per Second) inconnue.
     */
    // VOTRE CODE ICI...

    /**
     * Attribut qui représente le nom du CPU.
     */
    // VOTRE CODE ICI...

    /**
     * Attribut qui représente l'année de sortie du CPU.
     */
    // VOTRE CODE ICI...

    /**
     * Attribut qui représente le nombre de transistors utilisés dans le CPU.
     */
    // VOTRE CODE ICI...

    /**
     * Attribut qui représente la performance en MIPS (Millions Instructions Per
     * Second) du CPU.
     */
    // VOTRE CODE ICI...

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on connaît la valeur de
     * chaque attribut.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     * @param mips        la performance en MIPS (Millions Instructions Per Second)
     *                    du CPU
     */
    public CPU(String nom, int annee, long transistors, double mips) {
        // VOTRE CODE ICI...
    }

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on ne connaît pas la
     * performance du CPU. Dans ce cas, l'attribut
     * "mips" sera initialisé avec la valeur UNKNOWN_MIPS pour indiquer que cette
     * information n'est pas connue.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     */
    public CPU(String nom, int annee, long transistors) {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de l'attribut nom.
     *
     * @return la valeur de l'attribut nom
     */
    public String getNom() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de l'attribut annee.
     *
     * @return la valeur de l'attribut annee
     */

    public int getAnnee() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de l'attribut transistors.
     *
     * @return la valeur de l'attribut transistors
     */
    public long getTransistors() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de l'attribut mips.
     *
     * @return la valeur de l'attribut mips
     */
    public double getMips() {
        // VOTRE CODE ICI...
    }

}
