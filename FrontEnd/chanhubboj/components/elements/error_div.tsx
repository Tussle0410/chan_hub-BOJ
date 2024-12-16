import React from "react";
import Link from "next/link";
import Text from "./text";
import styles from "@/styles/Home.module.css";

interface ErrorProps {
  message: string;
}
const TextElement = ({ message }: ErrorProps) => {
  return (
    <div>
      <Text text={message}></Text>
      <Link href="/">
        <div className={styles.return_div}>
          <button>돌아가기</button>
        </div>
      </Link>
    </div>
  );
};

export default TextElement;
