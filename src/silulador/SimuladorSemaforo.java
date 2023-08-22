package silulador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimuladorSemaforo extends JFrame {
    private Images img;

    private JLabel semaforoLabel, pedestreLabel, semaforo2Label;

    ImageIcon semaforoVerde = new ImageIcon("assets/semaforo_verde.png");
    ImageIcon semaforoVermelho = new ImageIcon("assets/semaforo_vermelho.png");
    ImageIcon semaforoAmarelo = new ImageIcon("assets/semaforo_amarel.png");
    ImageIcon pedestreVermelho = new ImageIcon("assets/pedestre_vermelho.png");
    ImageIcon pedestreVerde = new ImageIcon("assets/pedestre_verde.png");
    private ImageIcon traficRed = semaforoVermelho;
    private ImageIcon traficYellow = semaforoAmarelo;
    private ImageIcon traficGreen = semaforoVerde;
    private ImageIcon traficPersonGreen = pedestreVermelho;
    ImageIcon traficPersonRed = pedestreVerde;



    private int corAtual = 0;

    public SimuladorSemaforo() {
        super("Simulador de Semáforo");



        semaforoLabel = new JLabel();
        semaforoLabel.setIcon(traficRed);
        pedestreLabel = new JLabel();
        pedestreLabel.setIcon(pedestreVerde);
        pedestreLabel.setIcon(pedestreVerde);


        semaforo2Label = new JLabel();
        semaforo2Label.setIcon(traficGreen);

        JButton iniciarButton = new JButton("Iniciar");
        iniciarButton.setSize(50,50);
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSimulacao();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(semaforoLabel, BorderLayout.WEST);

        panel.add(semaforo2Label,BorderLayout.CENTER);
        panel.add(iniciarButton, BorderLayout.SOUTH);

        add(panel);


        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void iniciarSimulacao() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        switch (corAtual) {
                            case 0:
                                semaforoLabel.setIcon(traficRed);
                                pedestreLabel.setIcon(traficPersonRed);
                                semaforo2Label.setIcon(traficGreen);
                                Thread.sleep(5000);
                                break;
                            case 1:
                                semaforoLabel.setIcon(traficRed);
                                semaforo2Label.setIcon(traficRed);
                                semaforo2Label.setIcon(traficYellow);
                                pedestreLabel.setIcon(traficPersonGreen);
                                Thread.sleep(7000);
                                break;
                            case 2:
                                semaforoLabel.setIcon(traficRed);
                                semaforoLabel.setIcon(traficGreen);
                                semaforo2Label.setIcon(traficRed);
                                Thread.sleep(2000);
                                break;
                        }
                        corAtual = (corAtual + 1) % 3;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }


            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimuladorSemaforo();
            }
        });
    }
}
