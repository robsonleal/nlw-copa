interface HomeProps {
  count: number;
}

export default function Home(props: HomeProps) {
  return <h1>Contagem: {props.count}</h1>;
}

export const getServerSideProps = async () => {
  const reponse = await fetch("http://localhost:8080/pools/count");
  const data = await reponse.json();

  return {
    props: {
      count: data.count,
    },
  };
};
