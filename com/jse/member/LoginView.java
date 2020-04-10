//package com.jse.member;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class LoginView extends JFrame implements ActionListener{
//	private static final long serialVersionUID = 1L;
//	JButton saveButton, cancelButton, joinButton, searchButton;
//	JLabel[] labels;
//	JTextField[] textFields;
//	JPanel panel;
//	public void open() {
//		this.setSize(400, 300);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		panel = new JPanel();
//		this.add(panel);
//		this.setVisible(true);
//		labels = new JLabel[2];
//		textFields = new JTextField[2];
//		String[] names = {"ID","PASSWORD"};
//		for(int i=0;i < names.length;i++) {
//			labels[i] = new JLabel(names[i]);
//			panel.add(labels[i]);
//			textFields[i] = new JTextField();
//			panel.add(textFields[i]);
//		}	
//		saveButton = new JButton("저장");
//		cancelButton = new JButton("취소");
//		joinButton = new JButton("회원가입");
//		searchButton = new JButton("아이디/비밀번호 찾기");
//		saveButton.addActionListener(this);
//		cancelButton.addActionListener(this);
//		joinButton.addActionListener(this);
//		searchButton.addActionListener(this);
//		panel.add(saveButton); 
//		panel.add(cancelButton);
//		panel.add(joinButton);
//		panel.add(searchButton);
//		labels[0].setBounds(40,50,40,40);
//		labels[1].setBounds(40,100,80,40);
//		textFields[0].setBounds(130,55,200,30);
//		textFields[1].setBounds(130,105,200,30);
//		saveButton.setBounds(40,170,80,30);
//		cancelButton.setBounds(155,170,80,30);
//		joinButton.setBounds(270,170,80,30);
//		searchButton.setBounds(385,170,80,30);
//		
//		this.setLocationRelativeTo(null);
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == saveButton) {
//			JOptionPane.showMessageDialog(this, textFields[0].getText());
//		}else if(e.getSource() == cancelButton) {
//			
//		}
//		
//	}
//
//}