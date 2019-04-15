package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import data.Patient;
import xml.PatientXmlRW;

public class PatientData {

	private JFrame frame;
	private JLabel text_name;
	private JLabel text_lastName;
	private JLabel text_disease;
	private JLabel[] text_record;
	private JLabel text_note;
	private JLabel text_gender;

	private PatientXmlRW patientXmlRW;
	private ArrayList<Patient> patients;
	
	
	
	/**
	 * @wbp.parser.constructor
	 */
	public PatientData(Patient patient) 
	{
		initialize(patient);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Patient patient) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 721);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		
		JLabel lblAddPatientData = new JLabel("Patient Data");
		lblAddPatientData.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblAddPatientData.setBounds(34, 43, 292, 33);
		frame.getContentPane().add(lblAddPatientData);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(205, 111, 143, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname:");
		lblLastname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastname.setBounds(205, 142, 143, 16);
		frame.getContentPane().add(lblLastname);
		
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDisease.setBounds(205, 168, 85, 15);
		frame.getContentPane().add(lblDisease);
		
		JLabel lblMedicalRecord = new JLabel("Medical Record:");
		lblMedicalRecord.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMedicalRecord.setBounds(205, 193, 136, 15);
		frame.getContentPane().add(lblMedicalRecord);
		
		text_name = new JLabel();
		text_name.setBounds(351, 114, 150, 21);
		frame.getContentPane().add(text_name);
		
		text_lastName = new JLabel();
		text_lastName.setBounds(351, 139, 150, 21);
		frame.getContentPane().add(text_lastName);
		
		text_disease = new JLabel();
		text_disease.setBounds(351, 165, 150, 21);
		frame.getContentPane().add(text_disease);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNote.setBounds(256, 280, 70, 28);
		frame.getContentPane().add(lblNote);
		
		text_record = new JLabel[4];
		text_record[0].setBounds(351, 192, 150, 21);
		frame.getContentPane().add(text_record[0]);
		
		text_record[1].setBounds(351, 221, 150, 21);
		frame.getContentPane().add(text_record[1]);
	
		text_record[2].setBounds(543, 192, 150, 21);
		frame.getContentPane().add(text_record[2]);
		
		text_record[3].setBounds(543, 221, 150, 21);
		frame.getContentPane().add(text_record[3]);
		
		JLabel label = new JLabel("3.");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(340, 218, 22, 21);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(340, 195, 46, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("2.");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(523, 192, 46, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_4.setBounds(523, 222, 46, 15);
		frame.getContentPane().add(label_4);
		
		text_note = new JLabel();
		text_note.setBounds(256, 312, 488, 283);
		frame.getContentPane().add(text_note);
		
		JLabel label_photo = new JLabel();
		label_photo.setBounds(34, 116, 150, 200);
		frame.getContentPane().add(label_photo);
		
		JLabel label_2 = new JLabel("Gender:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(205, 256, 95, 15);
		frame.getContentPane().add(label_2);
		
		text_gender = new JLabel();
		text_gender.setBounds(351, 254, 113, 16);
		frame.getContentPane().add(text_gender);
		text_gender.setText(patient.getGender());
		
		/* set label text and photo start */
		text_name.setText(patient.getName());
		text_lastName.setText(patient.getLastName());
		text_disease.setText(patient.getDisease());
		text_gender.setText(patient.getGender());
		
		for(int i = 0; i < patient.getMedicalRecord().size(); ++i)
		{
			text_record[i].setText(patient.getMedicalRecord().get(i)); 
		}
		
		text_note.setText(patient.getNote());
		
		label_photo.setIcon(new ImageIcon("/Users/kylehuang/CCU/Courses/XML/project/XML-Course/project1_template/img/person.png"));
		/* set label text and photo end*/
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(289, 540, 117, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		frame.getContentPane().add(btnBack);
		
		
	}
	
	private void setPatient()
	{
		patients = patientXmlRW.read();
		
	}
}
