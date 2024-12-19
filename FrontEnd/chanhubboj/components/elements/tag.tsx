import React from "react";
import styles from "@/styles/Home.module.css";

interface tagProps {
  tags: string;
}
const TagsElement = ({ tags }: tagProps) => {
  const tagArray = tags.split(",").map((tag) => tag.trim());
  return (
    <div className={styles.tags}>
      {tagArray.map((tag, index) => (
        <div className={styles.tag} key={index}>
          {tag}
        </div>
      ))}
    </div>
  );
};

export default TagsElement;
