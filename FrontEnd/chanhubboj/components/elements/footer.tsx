import React from "react";
import styles from "@/styles/Home.module.css";

export default function Footer() {
  return (
    <footer className={styles.footer}>
      <div className={styles.footer_content}>
        <p>&copy; {new Date().getFullYear()} ChanHub BOJ. All rights reserved.</p>
        <div className={styles.footer_links}>
          <a
            className={styles.footer_link}
            href="https://tussle.tistory.com/"
            target="_blank"
            rel="noopener noreferrer"
          >
            Tistory
          </a>
          <div className={styles.footer_link} rel="noopener noreferrer">
            Email - cksgud410@gmail.com
          </div>
        </div>
      </div>
    </footer>
  );
}
