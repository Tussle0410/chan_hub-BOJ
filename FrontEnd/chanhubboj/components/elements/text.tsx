import React from "react";
import styles from "@/styles/Home.module.css";

interface TextProps {
  text: string;
}
const TextElement = ({ text }: TextProps) => {
  return <div className={styles.text}>{text}</div>;
};

export default TextElement;
