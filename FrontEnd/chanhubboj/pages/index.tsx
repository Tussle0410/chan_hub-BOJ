import Head from "next/head";
import Image from "next/image";
import { Inter } from "next/font/google";
import styles from "@/styles/Home.module.css";
import SearchBar from "../components/elements/search_bar";
import Text from "../components/elements/text";
import ServerInfoComponent from "../components/elements/server_info";
import { ServerInfo } from "../components/interfaces/server_types";

export { getServerSideProps } from "../components/fetchs/main_fetch";

const inter = Inter({ subsets: ["latin"] });

export default function Home(getServerSideProps: ServerInfo) {
  return (
    <>
      <Head>
        <title>ChanHub BOJ</title>
        <meta name="description" content="ChanHub BOJ" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <main className={`${styles.main} ${inter.className}`}>
        {/* <div className={styles.description}>
          <p>
            Get started by editing&nbsp;
            <code className={styles.code}>pages/index.tsx</code>
          </p>
        </div> */}

        <div className={styles.center}>
          <Image
            className={styles.logo}
            src="/logo.png"
            alt="ChanHub BOJ Logo"
            width={700}
            height={300}
            priority
          />
          <SearchBar></SearchBar>
          <Text text="백준 문제 번호를 입력해주세요."></Text>
          <ServerInfoComponent serverInfo={getServerSideProps}></ServerInfoComponent>
          <Text text="대부분의 풀이 코드는 Java 언어를 기준으로 작성되어 있습니다."></Text>
        </div>
        <div className={styles.grid}></div>
      </main>
    </>
  );
}
