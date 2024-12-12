import React, { ChangeEvent, useState } from "react";
import { useRouter } from "next/router";
import styles from "@/styles/Home.module.css";

const NumberInput = () => {
  const [problemNumber, setInputValue] = useState("");
  const router = useRouter();

  const HandleChange = (event: ChangeEvent<HTMLInputElement>) => {
    const value = event.target.value;

    if (/^\d{0,5}$/.test(value)) {
      setInputValue(value);
    }
  };

  const HandleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    if (problemNumber) {
      router.push(`/solved?problemId=${problemNumber}`);
    }
  };

  return (
    <form onSubmit={HandleSubmit}>
      <input
        className={styles.input}
        type="number"
        value={problemNumber}
        onChange={HandleChange}
      ></input>
    </form>
  );
};

export default NumberInput;
