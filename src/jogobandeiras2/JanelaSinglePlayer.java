package jogobandeiras2;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Martins Santana
 */
public class JanelaSinglePlayer extends javax.swing.JFrame {

    private Random r = new Random();
    int rand;
    private Sorteio s;
    StringBuilder sb;
    private int perguntas = 12;
    private int pontos = 0;
    private int vitoriasSeguidas = 0;
    private boolean usouMapa = false;
    private String paises = "";

    public JanelaSinglePlayer() {
        initComponents();
        novoJogo(0, 0);
        /*for(int i = 0; i < 100; i++)
        {
            System.out.println(r.nextInt(15));
        }*/
        //bandeira.setIcon(new ImageIcon("resources/Interrogação.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblPerguntas = new javax.swing.JLabel();
        lblVitorias = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        btnResponder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAfrica = new javax.swing.JButton();
        btnAsia = new javax.swing.JButton();
        btnAmNorte = new javax.swing.JButton();
        btnAmSul = new javax.swing.JButton();
        btnAmCentral = new javax.swing.JButton();
        btnEuropa = new javax.swing.JButton();
        btnOceania = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnHNorte = new javax.swing.JButton();
        btnHSul = new javax.swing.JButton();
        btnHOriental = new javax.swing.JButton();
        btnHOcidental = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnVermelho = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnAmarelo = new javax.swing.JButton();
        btnLaranja = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnPreto = new javax.swing.JButton();
        btnDourado = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnEstrela = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnJogouCopa = new javax.swing.JButton();
        btnGanhouCopa = new javax.swing.JButton();
        bandeira = new javax.swing.JButton();
        lblPontuacao = new javax.swing.JLabel();
        btnProsseguir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jButton20.setText("jButton12");

        setTitle("Jogo das Bandeiras 2 - Um Jogador");

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        lblPerguntas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPerguntas.setForeground(new java.awt.Color(255, 255, 255));
        lblPerguntas.setText("Perguntas Restantes: 10");

        lblVitorias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVitorias.setForeground(new java.awt.Color(255, 255, 255));
        lblVitorias.setText("Sequência de Vitórias: 0");

        comboBox.setMaximumRowCount(10);
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Angola", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Belarus", "Bélgica", "Belize", "Benin", "Bolívia", "Bósnia-Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Faso", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Casaquistão", "Catar", "Chade", "Chile", "China", "Chipre", "Cingapura", "Colômbia", "Comores", "Congo", "Coréia do Norte", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dinamarca", "Djibouti", "Egito", "El Salvador", "Emirados Árabes", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estados Unidos", "Estônia", "Etiópia", "Fiji", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Grécia", "Guatemala", "Guiana", "Guiné", "Guiné Equatoria", "Guiné-Bissau", "Haiti", "Holanda", "Honduras", "Hungria", "Iêmen", "Ilhas Marshall", "Ilhas Salomão", "Índia", "Indonésia", "Inglaterra", "Irã", "Iraque", "Irlanda", "Irlanda do Norte", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letônia", "Líbano", "Libéria", "Líbia", "Lituânia", "Luxemburgo", "Macedônia", "Madagascar", "Malásia", "Malawi", "Maldivas", "Mali", "Malta", "Marrocos", "Maurício", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mongólia", "Montenegro", "Myanmar", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Níger", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "País de Gales", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paraguai", "Peru", "Polônia", "Portugal", "Quênia", "Quirguistão", "República Centro-Africana", "República Democratica do Congo", "República Dominicana", "República Tcheca", "Romênia", "Ruanda", "Rússia", "Samoa", "São Tomé e Príncipe", "Senegal", "Serra Leoa", "Sérvia", "Seychelles", "Síria", "Somália", "Sri Lanka", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Togo", "Tonga", "Trinidad e Tobago", "Tunísia", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Usbequistão", "Vanuatu", "Venezuela", "Vietnã", "Zâmbia", "Zimbábue" }));

        btnResponder.setBackground(new java.awt.Color(255, 0, 0));
        btnResponder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResponder.setForeground(new java.awt.Color(255, 255, 255));
        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cores");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Continentes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Hemisférios");

        btnAfrica.setBackground(new java.awt.Color(255, 255, 255));
        btnAfrica.setText("África");
        btnAfrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfricaActionPerformed(evt);
            }
        });

        btnAsia.setBackground(new java.awt.Color(255, 255, 255));
        btnAsia.setText("Ásia");
        btnAsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsiaActionPerformed(evt);
            }
        });

        btnAmNorte.setBackground(new java.awt.Color(255, 255, 255));
        btnAmNorte.setText("América do Norte");
        btnAmNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmNorteActionPerformed(evt);
            }
        });

        btnAmSul.setBackground(new java.awt.Color(255, 255, 255));
        btnAmSul.setText("América do Sul");
        btnAmSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmSulActionPerformed(evt);
            }
        });

        btnAmCentral.setBackground(new java.awt.Color(255, 255, 255));
        btnAmCentral.setText("América Central");
        btnAmCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmCentralActionPerformed(evt);
            }
        });

        btnEuropa.setBackground(new java.awt.Color(255, 255, 255));
        btnEuropa.setText("Europa");
        btnEuropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuropaActionPerformed(evt);
            }
        });

        btnOceania.setBackground(new java.awt.Color(255, 255, 255));
        btnOceania.setText("Oceania");
        btnOceania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOceaniaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnHNorte.setBackground(new java.awt.Color(255, 255, 255));
        btnHNorte.setText("Norte");
        btnHNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHNorteActionPerformed(evt);
            }
        });

        btnHSul.setBackground(new java.awt.Color(255, 255, 255));
        btnHSul.setText("Sul");
        btnHSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHSulActionPerformed(evt);
            }
        });

        btnHOriental.setBackground(new java.awt.Color(255, 255, 255));
        btnHOriental.setText("Oriental");
        btnHOriental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOrientalActionPerformed(evt);
            }
        });

        btnHOcidental.setBackground(new java.awt.Color(255, 255, 255));
        btnHOcidental.setText("Ocidental");
        btnHOcidental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOcidentalActionPerformed(evt);
            }
        });

        btnAzul.setBackground(new java.awt.Color(0, 102, 255));
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });

        btnVermelho.setBackground(new java.awt.Color(255, 0, 0));
        btnVermelho.setForeground(new java.awt.Color(255, 0, 0));
        btnVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVermelhoActionPerformed(evt);
            }
        });

        btnVerde.setBackground(new java.awt.Color(0, 102, 0));
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnAmarelo.setBackground(new java.awt.Color(255, 255, 0));
        btnAmarelo.setForeground(new java.awt.Color(255, 255, 0));
        btnAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmareloActionPerformed(evt);
            }
        });

        btnLaranja.setBackground(new java.awt.Color(255, 102, 0));
        btnLaranja.setForeground(new java.awt.Color(255, 255, 255));
        btnLaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaranjaActionPerformed(evt);
            }
        });

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnPreto.setBackground(new java.awt.Color(0, 0, 0));
        btnPreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretoActionPerformed(evt);
            }
        });

        btnDourado.setBackground(new java.awt.Color(255, 255, 255));
        btnDourado.setText("Possui Brazão?");
        btnDourado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDouradoActionPerformed(evt);
            }
        });

        btnMapa.setBackground(new java.awt.Color(255, 255, 255));
        btnMapa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\JogoBandeiras2\\resources\\Terra.png")); // NOI18N
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(51, 255, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Detalhes");

        btnEstrela.setBackground(new java.awt.Color(255, 255, 255));
        btnEstrela.setText("Possui Estrela?");
        btnEstrela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnAfrica, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAmCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnAmSul, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAsia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEuropa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAmNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(btnOceania, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHSul, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHOriental, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHOcidental, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)
                                .addComponent(btnDourado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEstrela, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAfrica)
                    .addComponent(btnAmCentral)
                    .addComponent(btnAmNorte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAmSul)
                            .addComponent(btnAsia)
                            .addComponent(btnEuropa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOceania))
                    .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnHOriental)
                    .addComponent(btnHOcidental)
                    .addComponent(btnHNorte)
                    .addComponent(btnHSul))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDourado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEstrela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Perguntas");

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Informações");

        btnJogouCopa.setBackground(new java.awt.Color(255, 255, 255));
        btnJogouCopa.setText("Já jogou Copa do Mundo?");
        btnJogouCopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogouCopaActionPerformed(evt);
            }
        });

        btnGanhouCopa.setBackground(new java.awt.Color(255, 255, 255));
        btnGanhouCopa.setText("Já ganhou Copa do Mundo?");
        btnGanhouCopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGanhouCopaActionPerformed(evt);
            }
        });

        bandeira.setBackground(new java.awt.Color(255, 255, 255));
        bandeira.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\JogoBandeiras2\\resources\\Interrogação.png")); // NOI18N
        bandeira.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bandeira.setFocusable(false);
        bandeira.setMaximumSize(new java.awt.Dimension(211, 111));
        bandeira.setMinimumSize(new java.awt.Dimension(211, 111));

        lblPontuacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setText("Pontuação: 0");

        btnProsseguir.setBackground(new java.awt.Color(0, 102, 255));
        btnProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        btnProsseguir.setText(">>");
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPerguntas)
                                .addComponent(lblVitorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(btnJogouCopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGanhouCopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblPontuacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProsseguir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bandeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResponder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPerguntas)
                            .addComponent(jLabel7)
                            .addComponent(btnProsseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVitorias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPontuacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJogouCopa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGanhouCopa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfricaActionPerformed
        if (s.getContinente() == "África") {
            sb.append("Está na África" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na África" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAfrica.setEnabled(false);
    }//GEN-LAST:event_btnAfricaActionPerformed

    private void btnAmCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmCentralActionPerformed
        if (s.getContinente() == "América Central") {
            sb.append("Está na América Central" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na América Central" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAmCentral.setEnabled(false);
    }//GEN-LAST:event_btnAmCentralActionPerformed

    private void btnAsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsiaActionPerformed
        if (s.getContinente() == "Ásia" || s.getContinente() == "Eurásia") {
            sb.append("Está na Ásia" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na Ásia" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAsia.setEnabled(false);
    }//GEN-LAST:event_btnAsiaActionPerformed

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        if (perguntas > 0) {
            if (comboBox.getSelectedItem() == s.getPais()) {
                bandeira.setIcon(new ImageIcon("resources/Bandeiras/" + s.getPais() + ".png"));
                sb.append("A resposta é " + s.getPais() + "\n");
                txtInfo.setText(sb.toString());
                JOptionPane.showMessageDialog(null, "Você Acertou!!", "Acertou", JOptionPane.INFORMATION_MESSAGE);
                btnResponder.setEnabled(false);
                desabilitaBotoes();
                if (vitoriasSeguidas == 0) {
                    paises = s.getPais();
                } else {
                    paises = paises + " - " + s.getPais();
                }
                btnProsseguir.setEnabled(true);
                btnProsseguir.setVisible(true);
            } else {
                sb.append("Não é " + (comboBox.getSelectedItem()).toString() + "\n");
                txtInfo.setText(sb.toString());
                JOptionPane.showMessageDialog(null, "Você Errou!!", "Errou", JOptionPane.INFORMATION_MESSAGE);
                perguntas--;
                lblPerguntas.setText("Perguntas Restantes: " + perguntas);
                if (perguntas == 0) {
                    desabilitaBotoes();
                    JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            if (comboBox.getSelectedItem() == s.getPais()) {
                bandeira.setIcon(new ImageIcon("resources/Bandeiras/" + s.getPais() + ".png"));
                sb.append("A resposta é " + s.getPais() + "\n");
                txtInfo.setText(sb.toString());
                JOptionPane.showMessageDialog(null, "Você Acertou!!", "Acertou", JOptionPane.INFORMATION_MESSAGE);
                btnResponder.setEnabled(false);
                desabilitaBotoes();
                if (vitoriasSeguidas == 0) {
                    paises = s.getPais();
                } else {
                    paises = paises + " - " + s.getPais();
                }
                btnProsseguir.setEnabled(true);
                btnProsseguir.setVisible(true);
            } else {
                bandeira.setIcon(new ImageIcon("resources/Bandeiras/" + s.getPais() + ".png"));
                sb.append("A resposta é " + s.getPais() + "\n");
                txtInfo.setText(sb.toString());
                JOptionPane.showMessageDialog(null, "Você Errou!!", "Errou", JOptionPane.INFORMATION_MESSAGE);
                if (vitoriasSeguidas == 0) {
                    JOptionPane.showMessageDialog(null, "GAME OVER", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                    MenuPrincipal m = new MenuPrincipal();
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    m.setVisible(true);
                    this.dispose();
                } else {
                    int resp = JOptionPane.showConfirmDialog(null, "GAME OVER. Deseja registrar sua pontuação?", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                    if (resp == JOptionPane.YES_OPTION) {

                        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
                        try {
                            FileWriter fw;
                            fw = new FileWriter("SinglePlayerClassico.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            StringBuilder escritorArquivo = new StringBuilder();
                            escritorArquivo.append("Nome: " + nome + "\n");
                            escritorArquivo.append("Pontuação: " + pontos + "\n");
                            escritorArquivo.append("Sequência de Vitórias: " + vitoriasSeguidas + "\n");
                            escritorArquivo.append("Países acertados: " + paises + "\n");
                            escritorArquivo.append("Derrota em: " + s.getPais() + "\n");
                            escritorArquivo.append("---------------------------------------------------------------------------------------------------------------------------------");
                            bw.write(escritorArquivo.toString());
                            bw.flush();
                            /*System.out.println("Nome: " + nome);
                            System.out.println("Pontuação: " + pontos);
                            System.out.println("Sequência de Vitórias: " + vitoriasSeguidas);
                            System.out.println("Países acertados: " + paises);
                            System.out.println("Derrota em: " + s.getPais());*/
                        } catch (IOException ex) {
                            Logger.getLogger(JanelaSinglePlayer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    MenuPrincipal m = new MenuPrincipal();
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    m.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnResponderActionPerformed

    private void btnJogouCopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogouCopaActionPerformed
        if (s.isJogouCopa() == true) {
            sb.append("Jogou Copa - SIM" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Jogou Copa - NÃO" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnJogouCopa.setEnabled(false);
    }//GEN-LAST:event_btnJogouCopaActionPerformed

    private void btnGanhouCopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGanhouCopaActionPerformed
        if (s.isGanhouCopa() == true) {
            sb.append("Ganhou Copa - SIM" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Ganhou Copa - NÃO" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnGanhouCopa.setEnabled(false);
    }//GEN-LAST:event_btnGanhouCopaActionPerformed

    private void btnAmNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmNorteActionPerformed
        if (s.getContinente() == "América do Norte") {
            sb.append("Está na América do Norte" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na América do Norte" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAmNorte.setEnabled(false);
    }//GEN-LAST:event_btnAmNorteActionPerformed

    private void btnAmSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmSulActionPerformed
        if (s.getContinente() == "América do Sul") {
            sb.append("Está na América do Sul" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na América do Sul" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAmSul.setEnabled(false);
    }//GEN-LAST:event_btnAmSulActionPerformed

    private void btnEuropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuropaActionPerformed
        if (s.getContinente() == "Europa" || s.getContinente() == "Eurásia") {
            sb.append("Está na Europa" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na Europa" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnEuropa.setEnabled(false);
    }//GEN-LAST:event_btnEuropaActionPerformed

    private void btnOceaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOceaniaActionPerformed
        if (s.getContinente() == "Oceania") {
            sb.append("Está na Oceania" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está na Oceania" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnOceania.setEnabled(false);
    }//GEN-LAST:event_btnOceaniaActionPerformed

    private void btnHNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHNorteActionPerformed
        if (s.gethEquador() == "Acima" || s.gethEquador() == "Cortado") {
            sb.append("Está no Hemisfério Norte" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está no Hemisfério Norte" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnHNorte.setEnabled(false);
    }//GEN-LAST:event_btnHNorteActionPerformed

    private void btnHSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHSulActionPerformed
        if (s.gethEquador() == "Abaixo" || s.gethEquador() == "Cortado") {
            sb.append("Está no Hemisfério Sul" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está no Hemisfério Sul" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnHSul.setEnabled(false);
    }//GEN-LAST:event_btnHSulActionPerformed

    private void btnHOrientalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOrientalActionPerformed
        if (s.getmGreenwich() == "Leste" || s.getmGreenwich() == "Cortado") {
            sb.append("Está no Hemisfério Oriental" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está no Hemisfério Oriental" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnHOriental.setEnabled(false);
    }//GEN-LAST:event_btnHOrientalActionPerformed

    private void btnHOcidentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOcidentalActionPerformed
        if (s.getmGreenwich() == "Oeste" || s.getmGreenwich() == "Cortado") {
            sb.append("Está no Hemisfério Ocidental" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não está no Hemisfério Ocidental" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnHOcidental.setEnabled(false);
    }//GEN-LAST:event_btnHOcidentalActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorAzul(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAzul.setEnabled(false);
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVermelhoActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorVermelha(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnVermelho.setEnabled(false);
    }//GEN-LAST:event_btnVermelhoActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorVerde(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnVerde.setEnabled(false);
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmareloActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorAmarela(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnAmarelo.setEnabled(false);
    }//GEN-LAST:event_btnAmareloActionPerformed

    private void btnLaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaranjaActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorLaranja(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnLaranja.setEnabled(false);
    }//GEN-LAST:event_btnLaranjaActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorBranca(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnBranco.setEnabled(false);
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnPretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretoActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorPreta(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnPreto.setEnabled(false);
    }//GEN-LAST:event_btnPretoActionPerformed

    private void btnDouradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDouradoActionPerformed
        int n = s.getNumCores();
        String vet[] = s.getCores();
        String res = verificaCorDourada(n, vet);
        sb.append(res + "\n");
        txtInfo.setText(sb.toString());
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnDourado.setEnabled(false);
    }//GEN-LAST:event_btnDouradoActionPerformed

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed
        btnResponder.setEnabled(true);
        if (usouMapa == true) {
            novoJogo((perguntas * 10) + 50, vitoriasSeguidas + 1);
        } else {
            novoJogo((perguntas * 10) + 55, vitoriasSeguidas + 1);
        }
    }//GEN-LAST:event_btnProsseguirActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você só pode acessar o mapa uma vez por rodada, tem certeza que quer fazer isso agora?", "Tem certeza?", JOptionPane.INFORMATION_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            btnMapa.setEnabled(false);
            usouMapa = true;
            Mapa m = new Mapa();
            m.setLocationRelativeTo(null);
            m.setDefaultCloseOperation(HIDE_ON_CLOSE);
            m.setVisible(true);
        }
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnEstrelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrelaActionPerformed
        if (s.isEstrela() == true) {
            sb.append("Tem estrela na bandeira" + "\n");
            txtInfo.setText(sb.toString());
        } else {
            sb.append("Não tem estrela na bandeira" + "\n");
            txtInfo.setText(sb.toString());
        }
        perguntas--;
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        if (perguntas == 0) {
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "Suas perguntas acabaram, você deve responder o país", "Perguntas encerradas", JOptionPane.INFORMATION_MESSAGE);
        }
        btnEstrela.setEnabled(false);
    }//GEN-LAST:event_btnEstrelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaSinglePlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bandeira;
    private javax.swing.JButton btnAfrica;
    private javax.swing.JButton btnAmCentral;
    private javax.swing.JButton btnAmNorte;
    private javax.swing.JButton btnAmSul;
    private javax.swing.JButton btnAmarelo;
    private javax.swing.JButton btnAsia;
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnDourado;
    private javax.swing.JButton btnEstrela;
    private javax.swing.JButton btnEuropa;
    private javax.swing.JButton btnGanhouCopa;
    private javax.swing.JButton btnHNorte;
    private javax.swing.JButton btnHOcidental;
    private javax.swing.JButton btnHOriental;
    private javax.swing.JButton btnHSul;
    private javax.swing.JButton btnJogouCopa;
    private javax.swing.JButton btnLaranja;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnOceania;
    private javax.swing.JButton btnPreto;
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JButton btnResponder;
    private javax.swing.JButton btnVerde;
    private javax.swing.JButton btnVermelho;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPerguntas;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblVitorias;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables

    private String verificaCorAzul(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Azul") {
                return "Tem Azul na bandeira";
            }
        }
        return "Não tem Azul na bandeira";
    }

    private String verificaCorVermelha(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Vermelho") {
                return "Tem Vermelho na bandeira";
            }
        }
        return "Não tem Vermelho na bandeira";
    }

    private String verificaCorVerde(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Verde") {
                return "Tem Verde na bandeira";
            }
        }
        return "Não tem Verde na bandeira";
    }

    private String verificaCorAmarela(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Amarelo") {
                return "Tem Amarelo na bandeira";
            }
        }
        return "Não tem Amarelo na bandeira";
    }

    private String verificaCorLaranja(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Laranja") {
                return "Tem Laranja na bandeira";
            }
        }
        return "Não tem Laranja na bandeira";
    }

    private String verificaCorBranca(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Branco") {
                return "Tem Branco na bandeira";
            }
        }
        return "Não tem Branco na bandeira";
    }

    private String verificaCorPreta(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Preto") {
                return "Tem Preto na bandeira";
            }
        }
        return "Não tem Preto na bandeira";
    }

    private String verificaCorDourada(int n, String[] vet) {
        for (int i = 0; i < n; i++) {
            if (vet[i] == "Dourado") {
                return "Tem brazão na bandeira";
            }
        }
        return "Não tem brazão na bandeira";
    }

    private void desabilitaBotoes() {
        btnAfrica.setEnabled(false);
        btnAsia.setEnabled(false);
        btnAmCentral.setEnabled(false);
        btnAmNorte.setEnabled(false);
        btnAmSul.setEnabled(false);
        btnEuropa.setEnabled(false);
        btnOceania.setEnabled(false);
        btnHNorte.setEnabled(false);
        btnHSul.setEnabled(false);
        btnHOcidental.setEnabled(false);
        btnHOriental.setEnabled(false);
        btnJogouCopa.setEnabled(false);
        btnGanhouCopa.setEnabled(false);
        btnAzul.setEnabled(false);
        btnAmarelo.setEnabled(false);
        btnVerde.setEnabled(false);
        btnVermelho.setEnabled(false);
        btnLaranja.setEnabled(false);
        btnBranco.setEnabled(false);
        btnPreto.setEnabled(false);
        btnDourado.setEnabled(false);
        btnMapa.setEnabled(false);
        btnEstrela.setEnabled(false);
    }

    private void novoJogo(int pts, int vitorias) {
        sb = new StringBuilder();
        rand = r.nextInt(183); //Número de países já registrados
        s = new Sorteio(rand);
        perguntas = 12;
        vitoriasSeguidas = vitorias;
        pontos += pts;
        usouMapa = false;
        txtInfo.setText("");
        bandeira.setIcon(new ImageIcon("resources/Interrogação.png"));
        lblPerguntas.setText("Perguntas Restantes: " + perguntas);
        lblVitorias.setText("Sequência de Vitórias: " + vitoriasSeguidas);
        lblPontuacao.setText("Pontuação: " + pontos);
        btnProsseguir.setEnabled(false);
        btnProsseguir.setVisible(false);

        btnAfrica.setEnabled(true);
        btnAsia.setEnabled(true);
        btnAmCentral.setEnabled(true);
        btnAmNorte.setEnabled(true);
        btnAmSul.setEnabled(true);
        btnEuropa.setEnabled(true);
        btnOceania.setEnabled(true);
        btnHNorte.setEnabled(true);
        btnHSul.setEnabled(true);
        btnHOcidental.setEnabled(true);
        btnHOriental.setEnabled(true);
        btnJogouCopa.setEnabled(true);
        btnGanhouCopa.setEnabled(true);
        btnAzul.setEnabled(true);
        btnAmarelo.setEnabled(true);
        btnVerde.setEnabled(true);
        btnVermelho.setEnabled(true);
        btnLaranja.setEnabled(true);
        btnBranco.setEnabled(true);
        btnPreto.setEnabled(true);
        btnDourado.setEnabled(true);
        btnMapa.setEnabled(true);
        btnEstrela.setEnabled(true);
    }
}
