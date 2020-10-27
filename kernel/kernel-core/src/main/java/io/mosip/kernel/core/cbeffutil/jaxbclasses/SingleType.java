//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//

package io.mosip.kernel.core.cbeffutil.jaxbclasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SingleTypeType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SingleTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Scent"/>
 *     &lt;enumeration value="DNA"/>
 *     &lt;enumeration value="Ear "/>
 *     &lt;enumeration value="Face"/>
 *     &lt;enumeration value="Finger"/>
 *     &lt;enumeration value="Foot"/>
 *     &lt;enumeration value="HandGeometry"/>
 *     &lt;enumeration value="Vein"/>
 *     &lt;enumeration value="Iris"/>
 *     &lt;enumeration value="Retina"/>
 *     &lt;enumeration value="Voice"/>
 *     &lt;enumeration value="Gait"/>
 *     &lt;enumeration value="Keystroke"/>
 *     &lt;enumeration value="LipMovement"/>
 *     &lt;enumeration value="SignatureSign"/>
 *     &lt;enumeration value="Palm"/>
 *     &lt;enumeration value="BackOfHand"/>
 *     &lt;enumeration value="Wrist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SingleTypeType")
@XmlEnum
public enum SingleType {

	@XmlEnumValue("Scent")
	SCENT("Scent"), DNA("DNA"), @XmlEnumValue("Ear ")
	EAR("Ear "), @XmlEnumValue("Face")
	FACE("Face"), @XmlEnumValue("Finger")
	FINGER("Finger"), @XmlEnumValue("Foot")
	FOOT("Foot"), @XmlEnumValue("Vein")
	VEIN("Vein"), @XmlEnumValue("HandGeometry")
	HAND_GEOMETRY("HandGeometry"), @XmlEnumValue("Iris")
	IRIS("Iris"), @XmlEnumValue("Retina")
	RETINA("Retina"), @XmlEnumValue("Voice")
	VOICE("Voice"), @XmlEnumValue("Gait")
	GAIT("Gait"), @XmlEnumValue("Keystroke")
	KEYSTROKE("Keystroke"), @XmlEnumValue("LipMovement")
	LIP_MOVEMENT("LipMovement"), @XmlEnumValue("SignatureSign")
	SIGNATURE_SIGN("SignatureSign");

	private final String value;

	SingleType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static SingleType fromValue(String v) {
		for (SingleType c : SingleType.values()) {
			if (c.value.equalsIgnoreCase(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
