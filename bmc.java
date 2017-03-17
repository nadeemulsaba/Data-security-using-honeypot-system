       jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 20, 510, 30);
 jButton3.setText("Proceed");
  jButton3.addActionListener(new java.awt.event.ActionListener() {
  public void actionPerformed(java.awt.event.ActionEvent evt) {
   jButton3ActionPerformed(evt);
            }        // Jpanel  provides a plateform to add features to java frames by adding back     ground colour within a specified text area) //   
                        //(this is my Applet so far, (JFrame), when i click on "Register" JButton, i want to open a   new window ) //                                                  
        });    
        jPanel1.add(jButton3);
        jButton3.setBounds(560, 110, 140, 30);
       getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 750, 520);
 pack();                       //( The pack method sizes the frame so that all its contents are at or above their preferred sizes. An alternative to pack is to establish a frame size explicitly by calling setSize or setBounds (which also sets the frame location) //
    }// </editor-fold>
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
             try {
                 String f=jTextField1.getText();
                  Random r=new Random();
                 int n=0; int frag=0; int rst=0; int syn=0; int ip=0;
                  HashSet<FiveTuple> udps = new HashSet<FiveTuple >();
                  HashSet<FiveTuple> tcps = new HashSet<FiveTuple >();
                 //db config
                   Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jhoney", "root", "");
                   Statement st = con.createStatement();  //(we can establish a connection using the DriverManager.getConnection())//
                 //end of db
                    st.execute("truncate table data");
                    st.execute("truncate table iptrace");
                 CaptureIterator it =new CaptureIterator(CaptureFileFactory.createCaptureFileReader(f)); 
                               //( Used to capture all iterative packets including its schemas)//
while(it.hasNext()){
    int deport=8000;
           byte data[] = it.next();

 if(EthernetFrame.statIsIpv4Packet(data) )
 {
    n++;
    IPv4Packet ippacket = new IPv4Packet(data) ;
     StringBuffer sb=new StringBuffer();     //(The StringBuffer class is used to create mutable string. ... main(String args[]) //
    if(IPFactory.isTCPPacket(data)){
     tcps.add(new FiveTuple(data));   //tcps protocol resolves identifiers and configures server to the main function //
     TCPPacket tcppkt = new TCPPacket(data) ;
  deport=   tcppkt.getDestinationPort();
 int y=r.nextInt(dura.length);
      String a=dura[y];
      int b=ippacket.getId();
      int c=tcppkt.getSourcePort();
      int d=tcppkt.getDestinationPort();
      String e=ippacket.getSourceIPAsString();
      String f1=ippacket.getDestinationIPAsString();
      String g=ippacket.getSrcMAC();
      String h=ippacket.getDstMAC();
      int i=ippacket.getTTL();
   long j=tcppkt.getSequenceNumber();

